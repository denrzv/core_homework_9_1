package io.github.denrzv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {
    final private int upvotes;
    final private String id, text, type, user;

    public CatFact(@JsonProperty("id") String id,
                   @JsonProperty("text") String text,
                   @JsonProperty("type") String type,
                   @JsonProperty("user") String user,
                   @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.upvotes = upvotes;
        this.text = text;
        this.type = type;
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CatFact{");
        sb.append("id=").append(id);
        sb.append(", upvotes=").append(upvotes);
        sb.append(", text='").append(text).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", user='").append(user).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }
}
