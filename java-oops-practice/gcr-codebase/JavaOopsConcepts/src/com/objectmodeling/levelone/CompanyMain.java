package com.objectmodeling.levelone;

public class CompanyMain {

	public static void main(String[] args) {

		//Company object
        Company company = new Company("Ethernos Technologies");

        //Department object
        Department dev = new Department("Technology");
        dev.addEmployee("David Boll");
        dev.addEmployee("Selena Fritz");
        Department hr = new Department("Social Media");
        hr.addEmployee("Adele Maria");

        company.addDepartment(dev);
        company.addDepartment(hr);

        //Display details
        company.showCompanyDetails();

    }

}
