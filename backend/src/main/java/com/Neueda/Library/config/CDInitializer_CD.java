package com.Neueda.Library.config;

import com.Neueda.Library.model.Book;
import com.Neueda.Library.model.CD;
import com.Neueda.Library.repository.BookRepository;
import com.Neueda.Library.repository.CDRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CDInitializer_CD {
    @Bean
    CommandLineRunner initDatabase(CDRepository cdRepository){
        return args -> {
            var cds = List.of(new CD("Reputation", "Taylor Swift", "Reputation", 2017, "Pop" ));
            cdRepository.saveAll(cds);
        };
    }
}
