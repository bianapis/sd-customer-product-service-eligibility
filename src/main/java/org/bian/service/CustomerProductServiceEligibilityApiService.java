/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerProductServiceEligibilityApiService {

	CustomerProductServiceEligibilityCheckResponse evaluateChecks(String crReferenceId, CustomerProductServiceEligibilityCheckBase request);
	
	CustomerProductServiceEligibilityNextBestResponse evaluateNextBests(String crReferenceId, CustomerProductServiceEligibilityNextBestBase request);
	
	CustomerProductServiceEligibilityRecordResponse record(String crReferenceId, CustomerProductServiceEligibilityRecordRequest request);
	
	CustomerProductServiceAuthorizeCheckResponse authorizeChecks(String crReferenceId, CustomerProductServiceEligibilityCheckBase request);
	
	RetrieveCustomerEligibilityAssessmentProfileResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerProductServiceEligibilityCheckResponse retrieveChecks(String crReferenceId, String bqReferenceId);
	
	CustomerProductServiceEligibilityNextBestResponse retrieveNextBests(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
}
