package com.board.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
	private long 		userNo; // int NOT NULL AUTO_INCREMENT,
	private String		id; //varchar(45) NOT NULL,
	private String  	pwd; // varchar(45) NOT NULL,
	private String		hp; //varchar(45) NOT NULL,
	private String		email1; // varchar(45) NOT NULL,
	private String 		email2; // varchar(45) NOT NULL,
	private String  	address1; // varchar(45) DEFAULT NULL,
	private String  	address2; //varchar(45) DEFAULT NULL,
	private String  	zipcode; // varchar(45) DEFAULT NULL,
	private Timestamp   regDate; //` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
	private Timestamp 	outDate; //` timestamp NULL DEFAULT NULL,
	private String  	outUser; //` char(1) NOT NULL DEFAULT 'N',
}
