package com.zhihu.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * @author tzz
 * @Package com.zhihu.book.pojo
 * @Name Answer
 */
public class Answer {

    @Id
    private String id;

    private String aContent;

    private int likeNum;

    //回答
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false, fetch = FetchType.LAZY)
    private List<Answer> answers;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false, fetch = FetchType.LAZY)
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "answers")
    private List<Comment> comments;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false, fetch = FetchType.LAZY)
    private User collect;
}
