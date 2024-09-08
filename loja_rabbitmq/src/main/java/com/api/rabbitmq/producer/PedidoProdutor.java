package com.api.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoProdutor {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void gerarResposta(String mensagem) {
		amqpTemplate.convertAndSend(
			"pedido-response-exchange",
			"pedido-response-queue-rout-key",
			mensagem
		);
	}
}
