package com.example.restfulAPI.Controller;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController';
import org.springframework.web.bind.annotation.*; // 어노테이션을 달기위한 임포트

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class CRUDcontroller {

    //http://localhost:8081/api/v1/get-api/hello에 접속시 "hello API"를 반환해줌
    //@RequestMapping은 모든 http의 모든 요청을 받는다. 스프링 4.3이후 사용안함 대체
    // @Getmapping,@PostMapping, @PutMapping,@DeleteMapping
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "hello API";
    }

    //http://localhost:8081/api/v1/get-api/valueable1/{파라미터}?name=
    @GetMapping(value = "/valueable1/{valueable}")
    public String getValueable(@PathVariable String valueable , String name){
        return name;
    }//{변수}와 @PathVariable의 매개변수의 이름이 동일해야함.

    //http://localhost:8081/api/v1/get-api/request?name=var&email=var1&age=var2
    //@RequestParam를 사용하면 쿼리스트링을 다 받아올수있음 하지만 선언된 매개변수 안에서만 가져올수 있음.
    // 만약 어떤 쿼리스트링이 올지 모른다면 map변수를 통해서 쿼리스트링을 받을 수도 있음.
    @GetMapping(value = "/request")
    public String getParameter(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String age,
            @RequestParam Map<String,String> parms){ // parms 변수 자체가 모든 쿼리스트링을 들고옴.
        StringBuilder sb = new StringBuilder();
        parms.entrySet().forEach(map->{
            sb.append(map.getKey() + ":" + map.getValue() + "\n");
        }); // entrySet은 map변수의 모든 내용을 꺼내는거임. 람다 사용.
        return sb.toString();
    }
}
