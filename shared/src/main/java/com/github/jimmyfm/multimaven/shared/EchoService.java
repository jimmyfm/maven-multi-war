package com.github.jimmyfm.multimaven.shared;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("echo")
public interface EchoService extends RemoteService
{

	String getEcho(String yell);
}