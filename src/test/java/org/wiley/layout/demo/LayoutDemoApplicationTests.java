package org.wiley.layout.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wiley.layout.demo.LayoutDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LayoutDemoApplication.class)
@WebAppConfiguration
public class LayoutDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
