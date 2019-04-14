package com.alten.customerservice.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.remoting.service.AmqpInvokerServiceExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alten.CustomerRpcServiceImpl;
import com.alten.RPC.CustomerRPCService;

/**
 * @author sachini
 *
 */
@Configuration
@EnableRabbit
public class RabbitConfig {    
	
	@Autowired 
	CustomerRpcServiceImpl customerRpcServiceImpl; 

	@Bean Queue queue() {
	    return new Queue("alten.vehicle.rpc");
	}
	
	@Bean 
	AmqpInvokerServiceExporter exporter(CustomerRPCService implementation, AmqpTemplate template) {
	    AmqpInvokerServiceExporter exporter = new AmqpInvokerServiceExporter();
	    exporter.setServiceInterface(CustomerRPCService.class);
	    exporter.setService(implementation);
	    exporter.setAmqpTemplate(template);
	    return exporter;
	}
	
	@Bean 
	SimpleMessageListenerContainer listener(ConnectionFactory factory, AmqpInvokerServiceExporter exporter, Queue queue) {
	    SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(factory);
	    container.setMessageListener(exporter);
	    container.setQueueNames(queue.getName());
	    return container;
	}
}
