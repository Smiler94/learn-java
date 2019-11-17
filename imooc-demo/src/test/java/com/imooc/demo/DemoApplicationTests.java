package com.imooc.demo;

import com.imooc.demo.entity.Area;
import com.imooc.demo.producer.OrderSender;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	@Ignore
	void contextLoads() {
	}

	@Autowired
	private OrderSender orderSender;

	@Test
	void testSend1() throws Exception {
		Area area = new Area();
		area.setAreaId(12345);
		area.setAreaName("东苑");
		orderSender.send(area);
	}
}
