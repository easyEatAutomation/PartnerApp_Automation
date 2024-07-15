package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WebBase.WebBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageElements.ApplyDiscount;
import pageElements.CashDrawerOpenCashier;
import pageElements.CashDrawerCloseCashier;
import pageElements.CashDrawerCashIn;
import pageElements.CashDrawerCashOut;
import pageElements.CashDrawerKick;
import pageElements.CreateDineInOrders;
import pageElements.CreateTakeAwayOrder;
import pageElements.LoginPage;
import pageElements.LoginPageMobile;
import pageElements.OtherOptions;
import pageElements.PastRevertOrder;
import pageElements.POSPrint;
import pageElements.DeleteOrderRunningOrder;
import pageElements.SendEmail;
import pageElements.CompleteMergeBillOrder;
import pageElements.POSDinInFlatDiscountApply;
import pageElements.SplitBill;
import pageElements.settleBill;
//import pageElements.settleBill;
import pageElements.CreateTakeAwayOrder;
import pageElements.GrabOrderDelivery;
import pageElements.CustomerInfo;
import pageElements.DineInOrderwithmultiplecategoriesandItems;


public class Login {



	public WebDriver driver;
	public static WebDriver driver1;



	WebBase webBase = new WebBase();
	LoginPage loginPage  = new LoginPage();
	LoginPageMobile loginPageMobile  = new LoginPageMobile();
	CreateDineInOrders CreateDineInOrders = new CreateDineInOrders();
	CreateTakeAwayOrder CreateTakeAwayOrder = new CreateTakeAwayOrder();
	OtherOptions OtherOptions = new OtherOptions();
	CashDrawerOpenCashier CashDrawerOpenCashier = new CashDrawerOpenCashier();
	CashDrawerCloseCashier CashDrawerCloseCashier = new CashDrawerCloseCashier ();
	CashDrawerCashIn CashDrawerCashIn = new CashDrawerCashIn ();
	CashDrawerCashOut CashDrawerCashOut = new CashDrawerCashOut();
	CashDrawerKick CashDrawerKick = new CashDrawerKick ();
	PastRevertOrder PastRevertOrder = new PastRevertOrder ();
	POSPrint POSPrint = new POSPrint ();     
	CompleteMergeBillOrder CompleteMergeBillOrder = new CompleteMergeBillOrder ();
	DeleteOrderRunningOrder DeleteOrderRunningOrder = new DeleteOrderRunningOrder();
	SendEmail SendEmail = new SendEmail ();
	POSDinInFlatDiscountApply POSDinInFlatDiscountApply = new POSDinInFlatDiscountApply ();
	SplitBill SplitBill = new SplitBill ();
	GrabOrderDelivery GrabOrderDelivery = new GrabOrderDelivery();
	CustomerInfo CustomerInfo= new CustomerInfo();
	DineInOrderwithmultiplecategoriesandItems DineInOrderwithmultiplecategoriesandItems = new DineInOrderwithmultiplecategoriesandItems();
	ApplyDiscount ApplyDiscount = new ApplyDiscount();
	settleBill settleBill = new settleBill();	




	/*Web Login flow*/



	@Given("I open {string} browser and {string}")
	public void i_open_browser_and(String browserName, String URL) {
		webBase.createDriver(browserName);
		webBase.openWebsite(URL);
	}
	
	
	@When("User is on Login Page")
	public void user_is_on_Login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("User is on Login Page");
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {


		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
		
	}
	

	@And("Click on Login button")
	public void click_on_loginButton() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.loginClick();

	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is Logged In");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws InterruptedException {

		loginPage.login_successfully();

	}


	@Then("user click  {string}")
	public void user_click(String string) throws InterruptedException {

		loginPage.click_one();
		loginPage.click_two();
		loginPage.click_three();
		loginPage.click_four();

	}
	@Then("click on SignIn button")
	public void click_on_SignIn_button() throws InterruptedException {
		loginPage.click_SignIn();

	}
	
	
	
/*Mobile App Login flow*/

	
	
	@Given("I open application")
    public void i_open_browser_and() {
        WebBase.launchApp();
	}

	@Then("User enters mobile credentials {string} and {string}")
	public void user_enters_mobile_credentials_and(String username, String password) throws InterruptedException {

		loginPageMobile.enterUsername(username);
		loginPageMobile.enterPassword(password);
	}
	

	@And("Click on app Login button")
	public void click_on_app_Login_button() throws InterruptedException {
		loginPageMobile.loginClick();
	}


	@Then("Message displayed Login Successfully on app")
	public void message_displayed_login_successfully_on_app() throws InterruptedException {
		loginPageMobile.login_successfully();

	}


	@Then("user click mobilePIN {string}")
	public void user_click_mobilePIN(String string) throws InterruptedException {
	
		loginPageMobile.click_one();
		loginPageMobile.click_two();
		loginPageMobile.click_three();
		loginPageMobile.click_four();

	}
	
	@Then("click on SignIn button on App")
	public void click_on_SignIn_button_on_App() throws InterruptedException {
		loginPageMobile.click_SignIn();

	}
	
	
	

	/*Create Dine In Order Flow*/



		@Then("it will redirect to the dashboard")
		public void it_will_redirect_to_the_dashboard() {
	
		}

	@When("User clicks on AutomateSMS if available")
	public void user_clicks_on_AutomateSMS_if_available() throws InterruptedException {
		CreateDineInOrders.AutomateSMS();
	}

	@When("user click on Create New Order button")
	public void user_click_on_Create_New_Order_button()throws InterruptedException {


		CreateDineInOrders.CreateOrderButton();
	}

	@Then("select DineIn")
	public void select_DineIn() throws InterruptedException{
		CreateDineInOrders.DineIn();
	}

	@Then("select Items ") 
	public void select_Items_() throws InterruptedException {
		CreateDineInOrders.ItemName();
	}
	@Then("select Items A") 
	public void select_Items_A() throws InterruptedException {
		CreateDineInOrders.ItemNameA();


	}

	@Then("Select Items B")
	public void select_Items_B() throws InterruptedException {
		CreateDineInOrders.ItemNameB();
	}


	@Then("Click on Create Order button")
	public void click_on_Create_Order_button()throws InterruptedException {
		CreateDineInOrders.CreateOrder();

	}

	@Then("select table")
	public void select_table()throws InterruptedException {
		CreateDineInOrders.selectTable();
	}

	@Then("user will click on Void Icon")
	public void user_will_click_on_Void_Icon() throws InterruptedException {
		CreateDineInOrders.VoidIcon();

	}

	@Then("user will click on Void Dish Button")
	public void user_will_click_on_Void_Dish_Button() throws InterruptedException {
		CreateDineInOrders.VoidDish();
	}

	//* Add Items and Settle Bill *//


	@When("User clicks on add items")
	public void user_clicks_on_add_items() throws InterruptedException {
		CreateDineInOrders.AddItems();
	}

	@When("User clicks on Settle Bill")
	public void user_clicks_on_Settle_Bill() throws InterruptedException {
		CreateDineInOrders.SettleBillOnDineIn();

	}

	@Then("User will Cash payment option")
	public void user_will_Cash_payment_option() throws InterruptedException {
		CreateDineInOrders.DineInCashPayment();
	}

	@Then("user completes the Order button")
	public void user_completes_the_Order_button() throws InterruptedException {
		CreateDineInOrders.CompleteOrder();
	}

	@Then("user will select the payment option as cash")
	public void user_will_select_the_payment_option_as_cash() throws InterruptedException {
		CreateDineInOrders.SelectCash();
	}

	@Then("bill swipe for full amount")
	public void bill_swipe_for_full_amount() throws InterruptedException {
		CreateDineInOrders.SwipeComplete();
	}

	//* Change DineIn Table *//

	@When("User clicks on table icon")
	public void user_clicks_on_table_icon() throws InterruptedException {
		CreateDineInOrders.tableChangeButton();
	}

	@Then("User will select Another Table number from Pop up")
	public void user_will_select_Another_Table_number_from_Pop_up() throws InterruptedException {
		CreateDineInOrders.TableNumber();
	}


	@Then("clicks on Trasnfer Table button")
	public void clicks_on_Trasnfer_Table_button() throws InterruptedException {
		CreateDineInOrders.TransferTableButton();
	}

	//* Delete Order *//

	@When("User clicks on Delete link")
	public void user_clicks_on_Delete_link() throws InterruptedException {
		CreateDineInOrders.DeleteOrderLink();
	}

	@Then("User will click on Order Delete button on Delete Pop up")
	public void user_will_click_on_Order_Delete_button_on_Delete_Pop_up() throws InterruptedException {
		CreateDineInOrders.DeleteOrderConfirmationButton();
	}

	//* DineInOrder with multiple categories and Items *//

	@Then("Click on Item Categories")
	public void click_on_Item_Categories() throws InterruptedException {
		DineInOrderwithmultiplecategoriesandItems.clickOnItemNames();
		//DineInOrderwithmultiplecategoriesandItems.clickOnItemNames1();


	}

	//	@Then("Select Items")
	//	public void select_Items() throws InterruptedException {
	//	    DineInOrderwithmultiplecategoriesandItems.selectItems();
	//	}



	/*Create Take Away Order Flow*/


	@When("User clicks on Create Order button from Dashboard")
	public void user_clicks_on_Create_Order_button_from_Dashboard() throws InterruptedException {

		CreateTakeAwayOrder.CreateOrderButton();
	}

	@When("User will select Take Away from Pop up")
	public void user_will_select_Take_Away_from_Pop_up() throws InterruptedException {
		CreateTakeAwayOrder.TakeAwayButton();
	}

	@When("User will select items from menu")
	public void user_will_select_items_from_menu() throws InterruptedException{
		CreateTakeAwayOrder.ItemName();
	}

	@Then("Click on Settle Bill button")
	public void click_on_Settle_Bill_button()  throws InterruptedException {
		CreateTakeAwayOrder.SettleBill();

	}

	@Then ("User will click on Complete Order")
	public void User_will_click_on_Complete_Order() throws InterruptedException {
		CreateTakeAwayOrder.CompleteTakeAwayOrer();
	}


	@When("user click on Past Orders tab")
	public void user_click_on_Past_Orders_tab() throws InterruptedException {
		CreateTakeAwayOrder.PastOrderTab();
	}

	@Then("click on Revert Order button")
	public void click_on_Revert_Order_button() throws InterruptedException {
		CreateTakeAwayOrder.RevertOrderButton();
	}

	@Then("click on Yes, Revert order")
	public void click_on_Yes_Revert_order() throws InterruptedException {
		CreateTakeAwayOrder.YesDeleteButton();
	}






	//	@Then("User will click on Overlay")
	//	public void user_will_click_on_Overlay() throws InterruptedException {
	//	    createTakeAwayOrder.overlayClick();
	//	}

	@Then("User will select payment option")
	public void user_will_select_payment_option() throws InterruptedException {
		CreateTakeAwayOrder.Cash();
	}

	@Then("User will select full amount")
	public void user_will_select_full_amount() throws InterruptedException {
		CreateTakeAwayOrder.enterAmount();
	}

	@Then("Click on Next button")
	public void click_on_Next_button() throws InterruptedException {
		CreateTakeAwayOrder.nextButton();

	}

	@Then("User will click on Done button on Pop up")
	public void user_will_click_on_Done_button_on_Pop_up() throws InterruptedException {
		CreateTakeAwayOrder.pendingAmountDoneButton();
	}

	@Then("User will click on Done button and Order will be created")
	public void user_will_click_on_Done_button_and_Order_will_be_created() throws InterruptedException {
		CreateTakeAwayOrder.DoneButtonBillingPage();
	}

	/*Create Other Orders Flow*/


	@When("User will select Other Orders from Pop up")
	public void user_will_select_Other_Orders_from_Pop_up() throws InterruptedException {
		OtherOptions.OtherOrderType();
	}	

	@Then("I close browser")
	public void i_close_browser() {
		webBase.closeBrowser();
	}


	// For Cash Drawer Open Cashier 

	@When("user click on Cash Drawer")
	public void user_click_on_Cash_Drawer()throws InterruptedException {
		CashDrawerOpenCashier.CashDrawer();
	}

	@Then("select open cashier")
	public void select_open_cashier() throws InterruptedException {
		CashDrawerOpenCashier.Opencashier(); 
	}

	@Then("Click on Countinu button")
	public void click_on_Countinu_button() throws InterruptedException {
		CashDrawerOpenCashier.ContinueButton ();
	}

	@Then("user enter {string} and {string}")
	public void user_enter_and(String username, String amount) throws InterruptedException {

		CashDrawerOpenCashier.enterusername(username);

		CashDrawerOpenCashier.enteramount(amount);
	}

	@Then("click on Done button")
	public void click_on_Done_button() throws InterruptedException {
		CashDrawerOpenCashier.donebutton()  ;
	}

	//	For cash Drawer Close Cashier

	@Then("select close cashier")
	public void select_close_cashier() throws InterruptedException {
		CashDrawerCloseCashier.Opencashier();
	}

	@Then("click on cashier Done button")
	public void click_on_cashier_Done_button() throws InterruptedException {
		CashDrawerCloseCashier.donebutton();
	}    
	//	  For Cash Drawer Cash In  

	@Then("select Cash In")
	public void select_Cash_In()  throws InterruptedException{
		CashDrawerCashIn.CashIn();
	}

	@Then("user enter name {string} and amount {string}")
	public void user_enter_name_and_amount(String cashiername, String amount) throws InterruptedException {

		CashDrawerCashIn.name1(cashiername);

		CashDrawerCashIn.amount(amount);
	}

	@Then("click on Cash In Done button")
	public void click_on_Cash_In_Done_button() throws InterruptedException{
		
		CashDrawerCashIn.CashInDoneButton();
	}
	//		Cash Drawer Cash Out


	@Then("select Cash Out")
	public void select_Cash_Out() throws InterruptedException {
		CashDrawerCashOut.CashOut();
	}

	@Then("user enter name in cash out {string} and amount {string}")
	public void user_enter_name_in_cash_out_Dilip1_and_amount(String nameOut, String amountOut)throws InterruptedException {
		CashDrawerCashOut.nameOut(nameOut);
		CashDrawerCashOut.amountOut(amountOut);
	}

	@Then("click on Cash Out Done button")
	public void click_on_Cash_Out_Done_button() throws InterruptedException{
		CashDrawerCashOut.CashOutDoneButton();
	} 
	//	    Cash Drawer Kick

	@Then("select Drawer Kick")
	public void select_Drawer_Kick() throws InterruptedException{
		CashDrawerKick.DrawerKick();
	}

	@Then("user enter name {string} for Cash Drawer Kick")
	public void user_enter_name_for_Cash_Drawer_Kick(String nameKick) throws InterruptedException {
		CashDrawerKick.nameKick(nameKick);
	}

	@Then("Click on Countinue button")
	public void click_on_Countinue_button() throws InterruptedException {
		CashDrawerCloseCashier.cashierConfirmationButton();
	}

	@Then("User will click on Done button to close the cashier")
	public void user_will_click_on_Done_button_to_close_the_cashier() throws InterruptedException {
	    CashDrawerCloseCashier.CashierDonebutton();
	    
	}
	
//	@Then("User_will_click_on_Report_Done_button")
//	public void User_will_click_on_Report_Done_button() throws InterruptedException {
//		CashDrawerCloseCashier.CashierReportDoneButton();
//	}
	
	@Then("User will click on cashier Report Done button")
	public void user_will_click_on_cashier_Report_Done_button() throws InterruptedException {
		CashDrawerCloseCashier.CashierReportDoneButton();
	}
	

	@Then("click on Drawer Kick Done button")
	public void click_on_Drawer_Kick_Done_button()throws InterruptedException {
		CashDrawerKick.DoneDrawerKick();
	}

	

	@Then("user will select Grab Order from Order Type Pop up")
	public void user_will_select_Grab_Order_from_Order_Type_Pop_up() throws InterruptedException {
		GrabOrderDelivery.GrabIcon();
	}

	@Then("User will select GrabDeliveryType Order from pop up")
	public void user_will_select_GrabDeliveryType_Order_from_pop_up() throws InterruptedException {
		GrabOrderDelivery.GrabDeliveryIcon();
	}


	//	   Past revert Order 

	@Then("select Items")
	public void select_Items() throws InterruptedException{
		PastRevertOrder.pastrevertSelectItem();

	}

	@Then("User will select GrabPickType Order from pop up")
	public void user_will_select_GrabPickType_Order_from_pop_up() throws InterruptedException {
		GrabOrderDelivery.GrabPickupIcon();
	}

	@Then("Click on Settle Bill from dashboard button")
	public void click_on_Settle_Bill_from_dashboard_button() throws InterruptedException{
		PastRevertOrder.SettleButtonDashboard();
	}

	@Then("User will click on Add Customer Details link")
	public void user_will_click_on_Add_Customer_Details_link1() throws InterruptedException {
		CustomerInfo.AddCustomerDetails();
	}



	@Then("User will select payment option Master Card")
	public void user_will_select_payment_option_Master_Card()throws InterruptedException {
		PastRevertOrder.SelcectMasterCard();
	}

	//	@Then("User will enter {string}")
	//	public void user_will_enter2(String string) throws InterruptedException {
	//	    CustomerInfo.DialCode(string);
	//	    
	//	}
	//	
	//	 @And("User will enter {string}")


	@Then("Click on Paid button")
	public void click_on_Paid_button()throws InterruptedException {
		PastRevertOrder.MasterPaidByMasterCard();
	}
	@Then("user will click on done button")
	public void user_will_click_on_done_button()throws InterruptedException {
		PastRevertOrder.FinalPaidDoneButton();
	}

	@Then("User will click on Complete button")
	public void user_will_click_on_Complete_button()throws InterruptedException{
		PastRevertOrder.CompleteOrder();
	}

	//	 public void User_will_enter3(String string) throws InterruptedException {
	//		 CustomerInfo.MobileNumber(string);
	//	 
	//	}

	@Then("user will select past order")
	public void user_will_select_past_order() throws InterruptedException{
		PastRevertOrder.ClickOnPast();   
	}

	@Then("Click on revert order")
	public void click_on_revert_order() throws InterruptedException {
		PastRevertOrder.PastRevertButton();
	}
	@Then("User will enter {string}")
	public void user_will_enter(String string) throws InterruptedException {
		// CustomerInfo.DialCode(string);
		CustomerInfo.MobileNumber(string);



	}

	@Then("click on Save button")
	public void click_on_Save_button1() throws InterruptedException {
		CustomerInfo.SaveButton();
	}


	@Then("User will click on Add Customer Details Button")
	public void user_will_click_on_Add_Customer_Details_Button() throws InterruptedException {
		CustomerInfo.CustomerInfoSaveButton();
	}

	@Then("Grab User will click on Add Customer Details Button")
	public void grab_User_will_click_on_Add_Customer_Details_Button() throws InterruptedException {
		CustomerInfo.GrabCustomerInfo();
	}




	@Then("click on Change Link")
	public void click_on_Change_Link() throws InterruptedException {
		CreateDineInOrders.PaymentChangeLink();
	}

	@Then("User clicks on Delete link on payment screen")
	public void user_clicks_on_Delete_link_on_payment_screen() throws InterruptedException {
		CreateDineInOrders.PaymentDeleteLink();
	}

	@Then("he will click on delete button on confirmation pop up screen")
	public void he_will_click_on_delete_button_on_confirmation_pop_up_screen() throws InterruptedException {

		CreateDineInOrders.Deletebuttonconfirmation();
	}

	@Then("Select the Master card as Payment option")
	public void select_the_Master_card_as_Payment_option() throws InterruptedException {
		CreateDineInOrders.SelectMasterCard();
	}

	@And("User will click on PayRm button")
	public void User_will_click_on_PayRm_button() throws InterruptedException {
		CreateDineInOrders.PayRMbuttononPopup();
	}

	@Then ("User will click on Done button and Orders will be created")
	public void User_will_click_on_Done_button_and_Order_will_be_created () throws InterruptedException {
		CreateDineInOrders.DoneButton();
	}

	@Then ("user will get the invoicenumber")
	public void user_will_get_the_invoicenumber() throws InterruptedException {
		String fullInvoiceNumber = CreateDineInOrders.getInvoice();
		String lastEightCharacters = fullInvoiceNumber.substring(fullInvoiceNumber.length() - 8);


	}

	@Then("click on yes revert button")
	public void click_on_yes_revert_button() throws InterruptedException {
		PastRevertOrder.Revert();
	} 

	//	 POS Print   

	@Then("Click on manual print button")
	public void click_on_manual_print_button() throws InterruptedException{
		POSPrint.RunningOrderDashboardPrintButton();
	}
	@And ("User will click on counter print button")
	public void user_will_click_on_counter_print_button() throws InterruptedException{
		POSPrint.CounterPrintButton();
	}

	@Then("Click on final bill recipt print button")
	public void click_on_final_bill_recipt_print_button() throws InterruptedException {
		POSPrint.PrintFinalBillRecipt();
	}
	
	@Then("click on Close Icon of pop up")
	public void click_on_Close_Icon_of_pop_up() throws InterruptedException {
	    POSPrint.printclosepopup();
	}

	@Then("user will on print button")
	public void user_will_on_print_button()throws InterruptedException {
		POSPrint.PastprintButton();
	}

	@Then("click on bill print button")
	public void click_on_bill_print_button()throws InterruptedException {
		POSPrint.PastBillPrintButton();
	} 
	@Then("click on Close Icon of Past Order pop up")
	public void click_on_Close_Icon_of_Past_Order_pop_up() throws InterruptedException {
	    POSPrint.ClosePrintPopupPastOrder();
	}
	

 @Then("User will click on counter print button1")
public void user_will_click_on_counter_print_button1() throws InterruptedException {
   POSPrint.CounterPrintButton1();
  
}

 @Then("Click on final bill recipt print button1")
 public void click_on_final_bill_recipt_print_button1() throws InterruptedException {
     POSPrint.CounterPrintButton1();
 }

 @Then("click on Close Icon of pop up1")
 public void click_on_Close_Icon_of_pop_up1() throws InterruptedException {
     POSPrint.ClosePopUpAddItems();
 }


 @Then("Click on Merge Print button")
 public void click_on_Merge_Print_button() throws InterruptedException {
     POSPrint.mergeprintbutton();
 }
 
 @Then("click on close icon of merge pop up")
 public void click_on_close_icon_of_merge_pop_up() throws InterruptedException {

     POSPrint.closemergepop();
 }
 

 //	    Complete Merge Bill Order 

	@When("I select the one-order checkbox")
	public void i_select_the_one_order_checkbox()throws InterruptedException {
		CompleteMergeBillOrder.selectFirstCheckBox();
	}

	@Then("the two-order checkbox should be selected")
	public void the_two_order_checkbox_should_be_selected() throws InterruptedException{
		CompleteMergeBillOrder.selectSecondCheckBox();
	}

	@Then("Click on merge Bill button")
	public void click_on_merge_Bill_button() throws InterruptedException{
		CompleteMergeBillOrder.ClickOnMergeBill();
	}

	@And ("Send it to textbox")
	public void Send_it_to_textbox () throws InterruptedException {
		String fullInvoiceNumber = CreateDineInOrders.getInvoice();
		String lastEightCharacters = fullInvoiceNumber.substring(fullInvoiceNumber.length() - 8);
		// Get the fetched invoice number again from the method and extract last 8 characters
		CreateDineInOrders.SearchInvoice(lastEightCharacters);

	}

	@Then("User will select payment option Master Card for swipe")
	public void user_will_select_payment_option_Master_Card_for_swipe()throws InterruptedException {
		CompleteMergeBillOrder.SelectMasterCardForSwipe();
	}

	@Then("mergebill swipe for full amount")
	public void mergebill_swipe_for_full_amount() throws InterruptedException {
		CompleteMergeBillOrder.MergeBillSwipeComplete();
	}

	@Then("click on close icon")
	public void click_on_close_icon() throws InterruptedException {
		CompleteMergeBillOrder.mergecloseIcon();
	}




	//	    Delete order from running order

	@Then("Click on Delete order button")
	public void click_on_Delete_order_button() throws InterruptedException {
		DeleteOrderRunningOrder.DeleteButtonRunningOrder ();
	}

	@Then("Click on yes Delete button")
	public void click_on_yes_Delete_button()throws InterruptedException {
		DeleteOrderRunningOrder.YesDeleteInRunning();
	} 

	@Then("Click on Settle Bill button for settling the old orders")
	public void click_on_Settle_Bill_button_for_settling_the_old_orders() throws InterruptedException {
		settleBill.CompleteOrder();
	}



	//	    Send Email

	//	    @Then("user will click on email button")
	//	    public void user_will_click_on_email_button() throws InterruptedException {
	//	     SendEmail.ClickOnEmailButton();
	//	    }
	//
	//	    @When("user on email page")
	//	    public void user_on_email_page() throws InterruptedException {
	//	    	System.out.println("User on Email page");
	//	    }
	//
	//	    @Then("user enters {string}")
	//	    public void user_enters(String EnterEmail) throws InterruptedException {
	//	    	SendEmail.EnterEmail(EnterEmail);
	//	    }
	//
	//	    @Then("clik on send button")
	//	    public void clik_on_send_button() throws InterruptedException {
	//	    	SendEmail.ClickOnSend();
	//	    }

	//	    Apply flat discount from Dashboard 

	@Then("click on edit amount")
	public void click_on_edit_amount()throws InterruptedException {
		POSDinInFlatDiscountApply.ClickOneditAmount();
	}



	@Then("Click on Add Amount Link")
	public void click_on_Add_Amount_Link() throws InterruptedException {
		ApplyDiscount.AddAmountLink();

	}


	@Then("Select flat discount amount")
	public void select_flat_discount_amount()throws InterruptedException {
		POSDinInFlatDiscountApply.SelectFlatDiscount();
	}
	@Then("Select {int} RM Flat Discount")
	public void select_RM_Flat_Discount(Integer int1) throws InterruptedException {
		ApplyDiscount.FlatDiscount();
	}
	@Then("Click on Apply Button")
	public void click_on_Apply_Button() throws InterruptedException {
		ApplyDiscount.ApplyButton();
	}
	@Then("Send {string} RM in Flat Discount")
	public void send_RM_in_Flat_Discount(String Send1RM) throws InterruptedException {
		ApplyDiscount.SendFlat1RM(Send1RM);
	}
	@Then("Select Celebrations reason")
	public void select_Celebrations_reason() {
		ApplyDiscount.SelectCelebration();
	}
	@Then("Verify Text SELECT REASON")
	public void verify_Text_SELECT_REASON() {
		ApplyDiscount.VerifySelectReason();
	}
	@Then("Click on Overlay")
	public void click_on_Overlay() throws InterruptedException {
		ApplyDiscount.ClickOverlay();

	}
	@Then("click on Percentage Discount Tab")
	public void click_on_Percentage_Discount_Tab() {
		ApplyDiscount.PercentageDiscount();
	}
	@Then("Send {string} percent in Flat Discount")
	public void send_percent_in_Flat_Discount(String SendPercentage3) throws InterruptedException {
		ApplyDiscount.SendPercentage(SendPercentage3);
	}

	@Then("user will click on apply button")
	public void user_will_click_on_apply_button()throws InterruptedException{
		POSDinInFlatDiscountApply.ClickApplyDiscounButton();
	}

	//	    Split Bill 

	@Then("select second item")
	public void select_second_item()throws InterruptedException {
		SplitBill.SelectSecondItem();
	}

	@Then("User will click on split bill")
	public void user_will_click_on_split_bill()throws InterruptedException {
		SplitBill.ClickOnSplitBill();
	}

	@Then("click to right move")
	public void click_to_right_move()throws InterruptedException {
		SplitBill.RightClickForSplit();
		
	}
		@Then("user will click on save button")
		public void user_will_click_on_save_button() throws InterruptedException {
		    SplitBill.saveButton();
		}

		@Then("User will click on settele bill1")
		public void user_will_click_on_settele_bill1() throws InterruptedException {
			SplitBill.SettleBill1st();
			
		
		}
		
		@Then("user will select the payment option as Visa Card1")
		public void user_will_select_the_payment_option_as_Visa_Card1() throws InterruptedException {
		    SplitBill.clickVisaCard();
		}
		
		@Then("bill swipe for full amount1")
		public void bill_swipe_for_full_amount1() throws InterruptedException {
			SplitBill.swipefor1st();
		}
		@Then("User will click on settele bill2")
		public void user_will_click_on_settele_bill2() throws InterruptedException {
			SplitBill.SettleBill2nd();

		}
		@Then("user will select the payment option as Visa Card2")
		public void user_will_select_the_payment_option_as_Visa_Card2() throws InterruptedException {
		    SplitBill.clickVisaCard1();
		}

		@Then("bill swipe for full amount2")
		public void bill_swipe_for_full_amount2() throws InterruptedException {
		    SplitBill.swipefor2nd();
		}



		@Then("Click on spilt bill pop up close icon")
		public void click_on_spilt_bill_pop_up_close_icon() throws InterruptedException {
			SplitBill.closeIcon();
		}
		
		
		@Then("user will click on Done button for returning to Dashboard")
		public void user_will_click_on_Done_button_for_returning_to_Dashboard() throws InterruptedException {
		    SplitBill.doneButton();
		}
		
		
		

	@Then("Select {int} percent in Flat Discount")
	public void select_percent_in_Flat_Discount(Integer int1) {
		ApplyDiscount.percentage5Discount();
	}
	@Then("click on TopUp Tab")
	public void click_on_TopUp_Tab() throws InterruptedException {
		ApplyDiscount.TopUpTab();

	}

	@Then("Select {int} RM Top Up Discount")
	public void select_RM_Top_Up_Discount(Integer int1) throws InterruptedException {
		ApplyDiscount.select10RM();
	}

	@Then("User will click on settele bill")
	public void user_will_click_on_settele_bill()throws InterruptedException {
		SplitBill.SplitSettleButton();
	}

	@Then ("Send {string} RM in TopUp Discount") 
	public void send_RM_in_TopUp_Discount(String send2rm)throws InterruptedException {
		ApplyDiscount.SendRMTopup(send2rm);

	} 

	//Send Email
	@Then("user will click on email button")
	public void user_will_click_on_email_button() throws InterruptedException {
	    SendEmail.ClickOnEmailButton();
	}


	@Then("user enters {string}")
	public void user_enters(String EnterEmail) throws InterruptedException {
	    SendEmail.EnterEmail(EnterEmail);
	}

	@Then("clik on send button")
	public void clik_on_send_button() throws InterruptedException {
	   SendEmail.ClickOnSend();
	   
	}
	
}	



