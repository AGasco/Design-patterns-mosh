package com.codewithmosh.structural.facade.Exercise;

import java.util.List;

public class TwitterService {
    public List<Tweet> getRecentTweets(String key, String secret){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(key, secret);
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
        return tweets;
    }

}
