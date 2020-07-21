package com.springboot.restclient.json;

public class JokeResponse {
  private String type;
  private Value value;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  public class Value {
    private int id;
    private String joke;

    public String getJoke() {
      return joke;
    }

    public void setJoke(String joke) {
      this.joke = joke;
    }
  }
}

