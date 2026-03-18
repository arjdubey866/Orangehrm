package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AdminPage;

public class AdminTest extends BaseTest {

    @Test public void TC_1_verifyMenu() {
        new AdminPage(driver).openAdmin(); }

    @Test public void TC_2_navigatePage() {
        new AdminPage(driver).openAdmin(); }

    @Test public void TC_3_verifyUsersList() {
        new AdminPage(driver).verifyUsersList(); }

    @Test public void TC_4_verifyAddButton() {
        new AdminPage(driver).verifyAddButton(); }

    @Test public void TC_5_addUser() {
        new AdminPage(driver).addUser(); }

    @Test public void TC_6_mandatoryFields() {
        new AdminPage(driver).clickAddWithoutData(); }

    @Test public void TC_7_addWithoutData() {
        new AdminPage(driver).submitEmptyUser(); }

    @Test public void TC_8_duplicateUser() {
        new AdminPage(driver).addDuplicateUser(); }

    @Test public void TC_9_invalidPassword() {
        new AdminPage(driver).addInvalidPasswordUser(); }

    @Test public void TC_10_searchInvalidUser() {
        new AdminPage(driver).searchUser(); }
}