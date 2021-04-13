package com.codewithmosh.structural.facade.Exercise;

public class Demo {
  public static void show() {
    var twitterService = new TwitterService();
    twitterService.getRecentTweets("key", "secret");
  }
}
