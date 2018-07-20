package com.example.demo.controller;

import com.example.demo.DTO.DtoTest;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Api(tags ="classTagTest")
@RestController
@RequestMapping(value = "/swaggerTestPath")
public class SwaggerDemoController {
//  private static final Logger logger =    LoggerFactory.getLogger(SwaggerDemoController.class);

//  @Autowired
//  private IUnionPayService unionPayService;
//


  @ApiOperation(value="get方法測式", notes="取得會員資料")
  @RequestMapping(value="getMethod",method=RequestMethod.GET)
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "Success", response = String.class),
          @ApiResponse(code = 401, message = "Unauthorized"),
          @ApiResponse(code = 403, message = "Forbidden"),
          @ApiResponse(code = 404, message = "Not Found"),
          @ApiResponse(code = 500, message = "Failure")})
  public String getMember(@ApiParam(value = "name that need to be updated", required = true)  @RequestParam String memberId) {
    System.out.println("==memberId===>"+memberId);
    return memberId;
  }

  @ApiOperation(value="post方法測試",response=DtoTest.class)
  @RequestMapping(value="postMethod",method=RequestMethod.POST)
  @ApiResponses(value = {
          @ApiResponse(code = 201, message = "Create", response = DtoTest.class),
          @ApiResponse(code = 500, message = "Failure")})
  public DtoTest post(@RequestBody DtoTest user) {
    System.out.println("==getValue1===>"+user.getValue1());
    System.out.println("==getValue2===>"+user.getValue2());
    System.out.println("==getValue3===>"+user.getValue3());
    System.out.println("==getValue4===>"+user.getValue4());
    System.out.println("==getValue5===>"+user.getValue5());
    return user;
  }
}