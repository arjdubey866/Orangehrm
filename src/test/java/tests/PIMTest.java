package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.PIMPage;

public class PIMTest extends BaseTest {

    @Test public void TC_1_verifyMenu() { new PIMPage(driver).openPIM(); }

    @Test public void TC_2_navigatePage() {
        new PIMPage(driver).openPIM(); }

    @Test public void TC_3_verifyList() {
        new PIMPage(driver).verifyEmployeeList(); }

    @Test public void TC_4_verifyAddBtn() {
        new PIMPage(driver).verifyAddEmployeeButton(); }

    @Test public void TC_5_addEmployee() {
        new PIMPage(driver).addEmployee("John", "Doe"); }

    @Test public void TC_6_addWithoutMandatory() {
        new PIMPage(driver).addEmployee("", ""); }

    @Test public void TC_7_checkAutoID() {
        new PIMPage(driver).checkEmployeeId(); }

    @Test public void TC_8_uploadImage() {
        new PIMPage(driver).uploadImage(); }

    @Test public void TC_9_invalidFileUpload() {
        new PIMPage(driver).uploadInvalidFile(); }

    @Test public void TC_10_searchEmployee() {
        new PIMPage(driver).searchEmployee(); }

    @Test public void TC_11_searchInvalidEmployee() {
        new PIMPage(driver).searchInvalidEmployee(); }

    @Test public void TC_12_resetSearch() {
        new PIMPage(driver).resetSearch(); }

    @Test public void TC_13_deleteEmployee() {
        new PIMPage(driver).deleteEmployee(); }
}