package com.cap.jumpthequeue.accesscodemanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.cap.jumpthequeue.accesscodemanagement.logic.api.Accesscodemanagement;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.AccessCodeCto;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.AccessCodeEto;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.UserEto;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.VisitorInfoEto;
import com.cap.jumpthequeue.accesscodemanagement.service.api.rest.AccesscodemanagementRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Accesscodemanagement}.
 */
@Named("AccesscodemanagementRestService")
public class AccesscodemanagementRestServiceImpl implements AccesscodemanagementRestService {

  @Inject
  private Accesscodemanagement accesscodemanagement;

  @Override
  public AccessCodeCto getVisitorAccessCode(String token) {

    return this.accesscodemanagement.getVisitorAccessCode(token);

  }

  @Override
  public AccessCodeEto getAccessCode(long queueid, UserEto userAskingCode) {

    return this.accesscodemanagement.getAccessCode(queueid, userAskingCode);
  }

  @Override
  public AccessCodeEto makeAccessCode(long number) {

    return this.accesscodemanagement.makeAccessCode(number);
  }

  @Override
  public PaginatedListTo<VisitorInfoEto> findVisitorInfoEtosByQueueId(long queueid) {

    return this.accesscodemanagement.findVisitorInfoEtosByQueueId(queueid);
  }

  @Override
  public PaginatedListTo<AccessCodeEto> getAccessCodeList(long queueid) {

    return this.accesscodemanagement.findAccessCodeByQueueId(queueid);
  }

}