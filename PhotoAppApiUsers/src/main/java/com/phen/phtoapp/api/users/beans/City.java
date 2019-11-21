package com.phen.phtoapp.api.users.beans;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class City {

		public City() {
			System.out.println("City bean initialized");
		}
		
		public String cityName() {
			return "Madurai";
		}
}
