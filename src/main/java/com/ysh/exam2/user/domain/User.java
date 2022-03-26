package com.ysh.exam2.user.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {
    //데이터 베이스에 있는 컬럼이랑 똑같은 속성을 갖어야 한다.
    //유저라는 class를 만들어 놓으면 필요할때 마다 사용 가능
    //DB에서 정보들이 자바로 들어올때 그것을 만들 그릇을 만들어 주는 것이다. --> Entity
    //자바에 DB에 대응하는 Entity도 있어야 한다.
    //DB의 user table에 있는 정보외 동일해야 한다.


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long id ;
    public LocalDateTime reg_date;
    public LocalDateTime update_date ;
    public String email ;
    public String password;
    public String name;


}
