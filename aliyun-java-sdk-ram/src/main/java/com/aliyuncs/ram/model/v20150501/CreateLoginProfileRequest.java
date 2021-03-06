/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreateLoginProfileRequest extends RpcAcsRequest<CreateLoginProfileResponse> {
	
	public CreateLoginProfileRequest() {
		super("Ram", "2015-05-01", "CreateLoginProfile");
		setProtocol(ProtocolType.HTTPS);
	}

	private String userName;

	private String password;

	private Boolean passwordResetRequired;

	private Boolean mFABindRequired;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		putQueryParameter("UserName", userName);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		putQueryParameter("Password", password);
	}

	public Boolean getPasswordResetRequired() {
		return this.passwordResetRequired;
	}

	public void setPasswordResetRequired(Boolean passwordResetRequired) {
		this.passwordResetRequired = passwordResetRequired;
		putQueryParameter("PasswordResetRequired", String.valueOf(passwordResetRequired));
	}

	public Boolean getMFABindRequired() {
		return this.mFABindRequired;
	}

	public void setMFABindRequired(Boolean mFABindRequired) {
		this.mFABindRequired = mFABindRequired;
		putQueryParameter("MFABindRequired", String.valueOf(mFABindRequired));
	}

	@Override
	public Class<CreateLoginProfileResponse> getResponseClass() {
		return CreateLoginProfileResponse.class;
	}

}
