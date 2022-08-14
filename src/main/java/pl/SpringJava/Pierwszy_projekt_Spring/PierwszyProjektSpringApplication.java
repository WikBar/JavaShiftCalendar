package pl.SpringJava.Pierwszy_projekt_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import pl.SpringJava.Pierwszy_projekt_Spring.Console.MainFrame;


import javax.swing.*;
import java.awt.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PierwszyProjektSpringApplication {


		public static void main(String[] args) {
			SpringApplication.run(PierwszyProjektSpringApplication.class, args);

			ConfigurableApplicationContext ctx = new SpringApplicationBuilder(MainFrame.class)
					.headless(false).run(args);

			EventQueue.invokeLater(() -> {

				MainFrame ex = ctx.getBean(MainFrame.class);
				ex.setVisible(true);
			});

		}
	}



