package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;
    private boolean toLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean getToLike() {
        return toLike;
    }

    public void setToLike(Boolean toLike) {
        this.toLike = toLike;
    }
}
