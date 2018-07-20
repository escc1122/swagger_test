package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User",description = "書本資料")
public class DtoTest {


  @JsonProperty(access= JsonProperty.Access.READ_ONLY)
  private Integer value1 = 5;

  @ApiModelProperty(hidden=true)
  private Integer value2 = 5;

  @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
  private Integer value3 = 5;

  private Integer value4 = 5;

  @ApiModelProperty(readOnly = true)
  private Integer value5 = 5;

  public Integer getValue1() {
    return value1;
  }

  public Integer getValue2() {
    return value2;
  }

  public Integer getValue3() {
    return value3;
  }

  public Integer getValue4() {
    return value4;
  }

  public Integer getValue5() {
    return value5;
  }
}
