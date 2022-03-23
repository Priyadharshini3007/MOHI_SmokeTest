package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class MasterDetailListSteps extends BaseClass{
	
//Master Detail List View
	
	@Given("^Navigate to Admin and Click Master Detail List submenu$")
	public void navigate_to_Admin_and_Click_Master_Detail_List_submenu() throws Throwable {
	   
		helper();
		mdl.MasterDetailListmenu();
	}

	@Given("^Select the Category to view the Master List$")
	public void select_the_Category_to_view_the_Master_List() throws Throwable {
	    
		mdl.masterListViewCategory();
	}
	
	@Given("^Ensure the Master Detail List can be viewed$")
	public void ensure_the_Master_Detail_List_can_be_viewed() throws Throwable {
   
		mdl.masterListView();
}
	

	
////////Edit Master Detail List
	


	@Given("^Select the Category to edit$")
	public void select_the_Category_to_edit() throws Throwable {
   
	mdl.Categorytoedit();
}

	@Given("^Filter the records by Name and Search Button$")
	public void filter_the_records_by_Name_and_Search_Button() throws Throwable {
    
	mdl.filterTheRecordToEdit();
}

	@Given("^Click edit button to edit the details$")
	public void click_edit_button_to_edit_the_details() throws Throwable {
	
	mdl.editCategory();
}
	

	@Given("^Click save button to save the Edited details$")
	public void Click_save_button_to_save_the_Edited_details() throws Throwable {
	
	mdl.SaveCategory();
	
	}
	
//Delete Master Detail
	
		@Given("^Select the Category to delete$")
		public void select_the_Category_to_delete() throws Throwable {
			
			mdl.categoryToDelete();
		 
		}
		

		@Given("^Select the Category to delete Associated Data$")
		public void select_the_Category_to_delete_Associated_Data() throws Throwable {
			
			mdl.categoryToDeleteAssociatedData();
		 
		}
		
		
		

		@Given("^Filter the records by Name and Search Button to delete the record$")
		public void filter_the_records_by_Name_and_Search_Button_to_delete_the_record() throws Throwable {
		    
			mdl.filterTheRecordToDelete();
		}

		@Given("^Click delete button to delete the details$")
		public void click_delete_button_to_delete_the_details() throws Throwable {
			
			mdl.deleteMasterDetailData();
		  
		}
		
//Master Detail List CODE and NAME Column in Asc order Sort
		
		@Given("^Select the Category to Sort$")
	public void Select_the_Category_to_Sort() throws Throwable {
			
			mdl.codeSortAsc();
			mdl.nameSortAsc();
	  
	}
		
// Category : Class (Asc)
	

		@Given("^Select the center in Class Category$")
		public void Select_the_center_in_Class_Category() throws Throwable {
			mdl.ClassCategoryAsc();
			mdl.ClasscenterSortAsc();
			mdl.ClassCodeSortAsc();
			mdl.ClassNameSortAsc();
			mdl.ClassOrderSortAsc();
		  
		}
		
//Category : Section (Asc)
		
		@Given("^Select Section Category to sort in Ascending order$")
		public void Select_Section_Category_to_sort_in_Ascending_order() throws Throwable {
			
			mdl.SectionNameSortAsc();
		}
		
//Category: Center,Class & Section Mapping (Asc)
		
		@Given("^Select Center class And SectionMapping Category to sort in Ascending order$")
		public void Select_Center_class_And_SectionMapping_Category_to_sort_in_Ascending_order() throws Throwable {
			
			mdl.CenterClassSectionCenterSortAsc();
			mdl.CenterClassSectionClassSortAsc();
			mdl.CenterClassSectionNameSortAsc();
			
		}
		
//Category: Subject (Asc)
		

		@Given("^Select Subject Category to sort in Ascending order$")
		public void Select_Subject_Category_to_sort_in_Ascending_order() throws Throwable {
			
			mdl.subjectCodeSortAsc();
			mdl.subjectNameSortAsc();
			mdl.parentSubjectSortAsc();
			mdl.isExaminableSortAsc();
			
		}
		
//Category: Center,Class & Subject Mapping (Asc)
		
		@Given("^Select Center class And Subject Mapping Category to sort in Ascending order$")
		public void Select_Center_class_And_Subject_Mapping_Category_to_sort_in_Ascending_order() throws Throwable {
			
			mdl.CenterClasssubjectCenterSortAsc();
			mdl.CenterClasssubjectClassSortAsc();
			mdl.CenterClasssubjectClassNameSortAsc();
			mdl.CenterClasssubjectClassParentSubjectSortAsc();
			mdl.CenterClasssubjectISExaminableSortAsc();
			mdl.CenterClasssubjectorderSortAsc();
		}
		
////Master Detail List CODE and NAME Column in Descending order Sort/////////////////////////////////
		
		@Given("^Select the Category to Sort in decending order$")
		public void Select_the_Category_to_Sort_in_decending_order() throws Throwable {
			
			mdl.codeSortDesc();
			mdl.nameSortDesc();
		  
		}
// Category : Class (Desc)
		
		
		@Given("^Select Class Category to sort in descending order$")
		public void Select_Class_Category_to_sort_in_descending_order() throws Throwable {
			mdl.CategoryClassSortdesc();
			mdl.ClasscenterSortdesc();
			mdl.ClassCodeSortDesc();
			mdl.ClassNameSortDesc();
			mdl.ClassOrderSortDesc();
		  
		}
		
//Category : Section (Desc)

		@Given("^Select Section Category to sort in Descending order$")
		public void Select_Section_Category_to_sort_in_Descending_order() throws Throwable {
			
			mdl.SectionNameSortDesc();

		  
		}
		
//Category: Center,Class & Section Mapping (Desc)
		
		@Given("^Select Center class And SectionMapping Category to sort in Descending order$")
		public void Select_Center_class_And_SectionMapping_Category_to_sort_in_Descending_order() throws Throwable {
			
			mdl.CenterClassSectionCenterSortDesc();
			mdl.CenterClassSectionClassSortDesc();
			mdl.CenterClassSectionNameSortDesc();
		}
	
		
//Category: Subject (Desc)
		
		@Given("^Select Subject Category to sort in Descending order$")
		public void Select_Subject_Category_to_sort_in_Descending_order() throws Throwable {
			
			mdl.SubjectCodeSortDesc();
			mdl.SubjectNameSortDesc();
			mdl.ParentSubjectSortDesc();
			mdl.isExaminableSortDesc();
		}
		
//Category: Center,Class & Subject Mapping (Desc)
		
		@Given("^Select Center class And Subject Mapping Category to sort in Descending order$")
		public void Select_Center_class_And_Subject_Mapping_Category_to_sort_in_Descending_order() throws Throwable {
			
			mdl.CenterClasssubjectCenterSortDesc();
			mdl.CenterClasssubjectClassSortDesc();
			mdl.CenterClasssubjectClassNameSortDesc();
			mdl.CenterClasssubjectClassParentSubjectSortDesc();
			mdl.CenterClasssubjectISExaminableSortDesc();
			mdl.CenterClasssubjectorderSortDesc();
			
		}
		
//MAaster Detail List Search
		
	//	Category :  Class
		
		@Given("^Ensure that all columns in Class Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Class_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategoryClassSearch();

		}
		
//		Category :  Section (Name)		
		
		@Given("^Ensure that all columns in Section Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Section_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategorySectionName();
			
		}
		
		
//		Category : Center,Class & Section Mapping	(search)	
		
		@Given("^Ensure that all columns in Center class Section mapping Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Center_class_Section_mapping_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategorycenterSectionMappingSearch();

			
		}
		
		
//		Category : Subject	(search)
		
		
		@Given("^Ensure that all columns in Subject Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Subject_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategorySubjectSearch();

		}
		
		

//		Category : Center,Class & Subject Mapping	(search)	
		
		@Given("^Ensure that all columns in Center class Subject mapping Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Center_class_Subject_mapping_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategoryCenterClassSubjectSearch();

		}	
		
//		Category : Sports	(search)
		
		@Given("^Ensure that all columns in Sports Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Sports_Category_search_functionality_working_properly() throws Throwable {
			
			mdl.CategorySportsSearch();
	
		}
		
//      Category : Religion	(search)
		
		@Given("^Ensure that all columns in Religion Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Religion_Category_search_functionality_working_properly() throws Throwable {
			
		    mdl.ReligionSearch();
		   
		}
		
//      Category : Future Aspiration (search)
		
		@Given("^Ensure that all columns in Future Aspiration Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Future__Aspiration_Category_search_functionality_working_properly() throws Throwable {
			
		  mdl.futureAspirationSearch();
		 
		}
		
	
//      Category : Fee Type (search)
		
		@Given("^Ensure that all columns in Fee Type Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Fee__Type_Category_search_functionality_working_properly() throws Throwable {
		
			mdl.feeTypeSearch();
		
		}
		
//      Category : City (search)
		
		@Given("^Ensure that all columns in City Category search functionality working properly$")
		public void Ensure_that_all_columns_in_City_Category_search_functionality_working_properly() throws Throwable {
		
			mdl.citySearch();
	
		}
		
//      Category : Neighbourhood (search)
		
		@Given("^Ensure that all columns in Neighbourhood Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Neighbourhood_Category_search_functionality_working_properly() throws Throwable {
		
			mdl.neighbourhoodSearch();
			
		}
		
// 		Category : Father Career, Mother Career, Future Career,Guardian career
		

		@Given("^Ensure that all columns in Careers Category search functionality working properly$")
		public void Ensure_that_all_columns_in_Careers_Category_search_functionality_working_properly() throws Throwable {
		
			mdl.CareersSearch();
			
		}
		
		
		
		
//Master Detail List paging Feature
		
		@Given("^Ensure that Paging Feature Working Properly$")
		public void Ensure_that_Paging_Feature_Working_Properly() throws Throwable {
			
			mdl.MasterDetailListPagingFeature();
			
		}
		
		
		}
