package com.chachae.leetcode.No_0355;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/design-twitter/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Twitter {

  static class User {

    Integer id;
    List<User> follows;

    public User(Integer id) {
      this.id = id;
      this.follows = new ArrayList<>();
    }
  }

  static class Tweet {

    int userId;
    int tweetId;

    public Tweet(int userId, int tweetId) {
      this.userId = userId;
      this.tweetId = tweetId;
    }
  }

  List<Tweet> tweets;
  HashMap<Integer, User> users;

  public Twitter() {
    users = new HashMap<>();
    tweets = new ArrayList<>();
  }

  public void postTweet(int userId, int tweetId) {
    User user = users.get(userId);
    if (user == null) {
      user = new User(userId);
    }
    Tweet tweet = new Tweet(userId, tweetId);
    tweets.add(tweet);
    users.put(userId, user);
  }

  public List<Integer> getNewsFeed(int userId) {
    List<Integer> list = new ArrayList<>();
    User user = users.get(userId);
    if (user == null) {
      return list;
    }
    List<User> follows = user.follows;
    for (int i = tweets.size() - 1; i >= 0; i--) {
      Tweet tweet = tweets.get(i);
      if (user.id == tweet.userId) {
        list.add(tweet.tweetId);
      }
      if (list.size() == 10) {
        return list;
      }
      for (User u : follows) {
        if (user.id.equals(u.id)) {
          continue;
        }
        if (u.id == tweet.userId) {
          list.add(tweet.tweetId);
        }
        if (list.size() == 10) {
          return list;
        }
      }
    }
    return list;
  }

  public void follow(int followerId, int followeeId) {
    User user = users.get(followerId);
    User f = users.get(followeeId);
    if (f == null) {
      f = new User(followeeId);
    }
    if (user == null) {
      user = new User(followerId);
      users.put(followerId, user);
      user.follows.add(f);
      return;
    }
    for (User u : user.follows) {
      // 已经关注过了
      if (u.id == followeeId) {
        return;
      }
    }
    users.put(followeeId, f);
    user.follows.add(f);
  }

  public void unfollow(int followerId, int followeeId) {
    User user = users.get(followerId);
    if (user == null) {
      return;
    }
    for (int i = 0; i < user.follows.size(); i++) {
      if (user.follows.get(i).id == followeeId) {
        user.follows.remove(i);
        break;
      }
    }
  }
}