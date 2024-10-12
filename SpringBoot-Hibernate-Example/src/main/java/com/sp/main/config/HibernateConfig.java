package com.sp.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    
    // Method to get a SessionFactory instance
    public static SessionFactory getSessionFactory() {
        // Create a Configuration instance
        Configuration cfg = new Configuration();
        
        // Load Hibernate configuration from the specified XML file
        cfg.configure("/com/sp/main/config/hibernate.cfg.xml");
        
        // Build and return a SessionFactory based on the configuration
        return cfg.buildSessionFactory();
    }
}