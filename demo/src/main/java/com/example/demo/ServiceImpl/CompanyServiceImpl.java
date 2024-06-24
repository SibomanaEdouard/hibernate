//package com.example.demo.ServiceImpl;
//
//import com.example.demo.Dto.CreateNewCompanyDto;
//import com.example.demo.Enum.Role;
//import com.example.demo.Repositories.CompanyRepository;
//import com.example.demo.Response.ApiResponse;
//import com.example.demo.Response.CompanyResponse;
//import com.example.demo.Response.UserResponse;
//import com.example.demo.Services.CompanyService;
//import com.example.demo.models.Company;
//import com.example.demo.utils.GetLoggedUser;
//import lombok.Builder;
//import lombok.RequiredArgsConstructor;
//import org.apache.coyote.BadRequestException;
//import org.hibernate.service.spi.ServiceException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Builder
//@RequiredArgsConstructor
//public class CompanyServiceImpl implements CompanyService {
//    private final CompanyRepository companyRepository;
//    private final GetLoggedUser getLoggedUser;
//
//    @Override
//    public ApiResponse<Object> createNewCompany(CreateNewCompanyDto dto) throws Exception {
//        try {
//            UserResponse userResponse=getLoggedUser.getLoggedUser();
//            //let me check if the user is logged
//            if(userResponse==null){
//
//                return ApiResponse.builder()
//                        .data("Login to conitue.....")
//                        .success(false)
//                        .build();
//            }
//            if(userResponse.getRole()!= Role.MANAGER){
//                return ApiResponse.builder()
////                        .data(resp)
//                        .data("You are not allowed to do this service please !")
//                        .success(false)
//                        .build();
//            }
//            // Validate the input
//            validateInput(dto);
//
//            // Convert DTO to entity
//            Company companyEntity = convertDtoToEntity(dto);
//
//            // Save the entity to the repository
//            Company savedCompany = companyRepository.save(companyEntity);
//
//            // Check if the company was saved successfully
//            if (savedCompany != null) {
//                // Form a response
//                CompanyResponse response = new CompanyResponse();
//                response.setMessage("Company started successfully!");
//                response.setCompany(savedCompany);
//
//                // Return success response
//                return ApiResponse.builder()
//                        .data(response)
//                        .success(true)
//                        .build();
//            } else {
//                // If the company was not saved, throw an exception
//                throw new ServiceException("Failed to start new company");
//            }
//        } catch (ServiceException e) {
//            // Catch and rethrow ServiceException
//            throw e;
//        } catch (Exception e) {
//            // Catch any other exceptions and wrap them in ServiceException
//            throw new ServiceException("Internal server error... " + e);
//        }
//    }
//
//
//
//    // Validate the input
//    private void validateInput(CreateNewCompanyDto dto) throws BadRequestException {
//        if(dto.getCompany_email() == null || dto.getCompany_name() == null || dto.getCompany_phone() == null) {
//            throw new BadRequestException("All details are required!");
//        }
//    }
//
//    // Convert DTO to entity
//    private Company convertDtoToEntity(CreateNewCompanyDto dto) {
//        Company company = new Company();
//        company.setCompany_email(dto.getCompany_email());
//        company.setCompany_name(dto.getCompany_name());
//        company.setCompany_phone(dto.getCompany_phone());
//        return company;
//    }
//
//    @Override
//    public ApiResponse<Object> getAllCompanies() throws Exception {
//        List<Company> companies = companyRepository.findAll();
//        try {
//            if (!companies.isEmpty()) {
//                // Assuming you want the first company in the list
//                Company company = companies.get(0);
//
//                // Form a response
//                CompanyResponse response = new CompanyResponse();
//                response.setMessage("Wow I am GOAT!");
//                response.setCompany(company);
//
//                // Return success response
//                return ApiResponse.builder()
//                        .data(response)
//                        .success(true)
//                        .build();
//            } else {
//                // If no companies were found, return an appropriate response
//                return ApiResponse.builder()
//                        .message("No companies found")
//                        .success(false)
//                        .build();
//            }
//        } catch (Exception e) {
//            throw new Exception("Error retrieving companies: " + e.getMessage());
//        }
//    }
//
//
//}
