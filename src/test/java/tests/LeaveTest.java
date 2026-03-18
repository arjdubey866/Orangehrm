package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LeavePage;

public class LeaveTest extends BaseTest {

    @Test public void TC_1_verifyMenu() {
        new LeavePage(driver).openLeave(); }

    @Test public void TC_2_navigatePage() {
        new LeavePage(driver).openLeave(); }

    @Test public void TC_3_verifyList() {
        new LeavePage(driver).verifyLeaveList(); }

    @Test public void TC_4_verifyBalance() {
        new LeavePage(driver).verifyBalance(); }

    @Test public void TC_5_resetFilter() {
        new LeavePage(driver).resetFilter(); }

    @Test public void TC_6_applyWithoutData() {
        new LeavePage(driver).applyLeave("", ""); }

    @Test public void TC_7_applyPastDate() {
        new LeavePage(driver).applyLeave("2020", "2020"); }

    @Test public void TC_8_invalidDateRange() {
        new LeavePage(driver).applyLeave("2025", "2024"); }
}