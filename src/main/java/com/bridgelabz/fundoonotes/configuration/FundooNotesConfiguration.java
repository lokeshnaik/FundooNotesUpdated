package com.bridgelabz.fundoonotes.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bridgelabz.fundoonotes.utility.JavaMessageService;
@Configuration
public class FundooNotesConfiguration 
{
   @Bean
   public JavaMessageService messageService()
   {
	   return new JavaMessageService();
   }
  @Bean
  public BCryptPasswordEncoder encryption()
  {
	  return new BCryptPasswordEncoder();
  }
   
}
