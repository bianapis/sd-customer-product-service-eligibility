/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class CustomerProductServiceEligibilityApiController {

	@Autowired
	CustomerProductServiceEligibilityApiService service;
	
	@BQ("checks")
	@Assess.Evaluate
	public BianResponse<CustomerProductServiceEligibilityCheckResponse> evaluateChecks(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerProductServiceEligibilityCheckBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluateChecks(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("next-bests")
	@Assess.Evaluate
	public BianResponse<CustomerProductServiceEligibilityNextBestResponse> evaluateNextBests(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerProductServiceEligibilityNextBestBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluateNextBests(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Record
	public BianResponse<CustomerProductServiceEligibilityRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerProductServiceEligibilityRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("checks")
	@Assess.Authorize
	public BianResponse<CustomerProductServiceAuthorizeCheckResponse> authorizeChecks(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerProductServiceEligibilityCheckBase> bianRequest) {
		return BianResponse.forSuccess(service.authorizeChecks(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<RetrieveCustomerEligibilityAssessmentProfileResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("checks")
	@Assess.Retrieve
	public BianResponse<CustomerProductServiceEligibilityCheckResponse> retrieveChecks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveChecks(crReferenceId, bqReferenceId));
	}
	
	@BQ("next-bests")
	@Assess.Retrieve
	public BianResponse<CustomerProductServiceEligibilityNextBestResponse> retrieveNextBests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveNextBests(crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
