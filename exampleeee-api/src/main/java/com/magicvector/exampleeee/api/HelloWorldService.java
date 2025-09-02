package com.exampleaaa.exampleeee.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface HelloWorldService {


    @ApiOperation(value = "打招呼", notes = "打招呼")
    @PostMapping("/example/sayHello")
    Boolean sayHello(@RequestBody String name);


}
