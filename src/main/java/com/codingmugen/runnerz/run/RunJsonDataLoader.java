//package com.codingmugen.runnerz.run;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//
//public class RunJsonDataLoader implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(RunJsonDataLoader.class);
//    private final RunRepository runRepository;
//    private final ObjectMapper objectMapper;
//
//    public RunJsonDataLoader(RunRepository runRepository, ObjectMapper objectMapper){
//        this.runRepository = runRepository;
//        this.objectMapper = objectMapper;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        if(runRepository.count() == 0){
//            try(var inputStream = getClass().getResourceAsStream("/data/runs.json")){
//                var runs = new ObjectMapper().readValue(inputStream, Run[].class);
//                for(var run : runs){
//                    runRepository.create(run);
//                }
//            } catch (IOException e){
//                log.error("Failed to load runs", e);
//            }
//        }
//    }
//
//}
