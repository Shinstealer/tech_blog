package com.shinstealer.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component //스프링에게 해당 클래스가 관리해야한다고 표시함
@Data //Lombok의 setter를 생성하는 기능과 생성자,toString등을 자동으로 생성
public class Restaurant {

	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
