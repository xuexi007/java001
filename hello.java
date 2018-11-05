package com.offcn.service;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Mobile;

public interface MService {
public void save(Mobile m);

public void saves(List<Mobile> list);

//查询手机号码的归属:number是一个7位数的号段
    @POST
    @Path("/find/{number}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Mobile searchByNumber(@PathParam("number")String number);
}
