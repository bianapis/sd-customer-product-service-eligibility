/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerProductServiceEligibilityApiServiceImpl implements CustomerProductServiceEligibilityApiService {

	public CustomerProductServiceEligibilityCheckResponse evaluateChecks(String crReferenceId, CustomerProductServiceEligibilityCheckBase request){
		return JsonReader.read("evaluate-CustomerProductServiceEligibilityCheckResponse.json",new TypeReference<CustomerProductServiceEligibilityCheckResponse>(){});
	}
	
	public CustomerProductServiceEligibilityNextBestResponse evaluateNextBests(String crReferenceId, CustomerProductServiceEligibilityNextBestBase request){
		return JsonReader.read("evaluate-CustomerProductServiceEligibilityNextBestResponse.json",new TypeReference<CustomerProductServiceEligibilityNextBestResponse>(){});
	}
	
	public CustomerProductServiceEligibilityRecordResponse record(String crReferenceId, CustomerProductServiceEligibilityRecordRequest request){
		return JsonReader.read("record-CustomerProductServiceEligibilityRecordResponse.json",new TypeReference<CustomerProductServiceEligibilityRecordResponse>(){});
	}
	
	public CustomerProductServiceAuthorizeCheckResponse authorizeChecks(String crReferenceId, CustomerProductServiceEligibilityCheckBase request){
		return JsonReader.read("authorize-CustomerProductServiceAuthorizeCheckResponse.json",new TypeReference<CustomerProductServiceAuthorizeCheckResponse>(){});
	}
	
	public RetrieveCustomerEligibilityAssessmentProfileResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveCustomerEligibilityAssessmentProfileResponse.json",new TypeReference<RetrieveCustomerEligibilityAssessmentProfileResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerProductServiceEligibilityCheckResponse retrieveChecks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerProductServiceEligibilityCheckResponse.json",new TypeReference<CustomerProductServiceEligibilityCheckResponse>(){});
	}
	
	public CustomerProductServiceEligibilityNextBestResponse retrieveNextBests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerProductServiceEligibilityNextBestResponse.json",new TypeReference<CustomerProductServiceEligibilityNextBestResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
