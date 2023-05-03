package com.course.kafka.broker.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.course.kafka.broker.message.DiscountMessage;
import com.course.kafka.broker.message.PromotionMessage;



@Service
@KafkaListener(topics = "t.commodity.promotion")
public class PromotionListener {

	private static final Logger log = LoggerFactory.getLogger(PromotionListener.class);

	
	@KafkaHandler
	public void listenPromotion(PromotionMessage message) {
//		Headers headers = message.headers();
//		PromotionMessage orderMessage = message.value();

		log.info("PromotionListener.listenPromotion: " + message);

	}
	
	@KafkaHandler
	public void listenDiscount(DiscountMessage message) {
//		Headers headers = message.headers();
//		PromotionMessage orderMessage = message.value();

		log.info("PromotionListener.DiscountMessage: " + message);

	}
	

}
