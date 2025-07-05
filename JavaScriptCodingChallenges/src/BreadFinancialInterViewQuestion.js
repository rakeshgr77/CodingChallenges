"use strict";
/*
We are building a program to manage a gym's membership. The gym has multiple members, each with a unique ID, name, and membership status. The program allows gym staff to add new members, update members status, and get membership statistics.

Definitions:
* A "member" is an object that represents a gym member. It has properties for the ID, name, and membership status.
* A "membership" is a class which is used for managing members in the gym.

To begin with, we present you with two tasks:
1-1) Read through and understand the code below. Please take as much time as necessary, and feel free to run the code.
1-2) The test for Membership is not passing due to a bug in the code. Make the necessary changes to Membership to fix the bug.
*/

const assert = require("assert");

class MembershipStatus {
    /*
    Membership Status is of three types: BASIC, PRO and ELITE.
    BASIC is the default membership a new member gets.
    PRO and ELITE are paid memberships for the gym.
    */
    static BASIC = 1;
    static PRO = 2;
    static ELITE = 3;


}

class Member {
    /* Data about a gym member. */
    constructor(memberId, name, membershipStatus) {
        this.memberId = memberId;
        this.name = name;
        this.membershipStatus = membershipStatus;
    }

    isEqual(other) {
        if (!(other instanceof Member)) {
            return false;
        }
        return (
            this.memberId === other.memberId &&
            this.name === other.name &&
            this.membershipStatus === other.membershipStatus
        );
    }

    toString() {
        return `Member ID: ${this.memberId}, Name: ${this.name}, Membership Status: ${this.membershipStatus}`;
    }
}

class Membership {
    /*
    Data for managing a gym membership, and methods which staff can
    use to perform any queries or updates.
    */
    constructor() {
        this.members = [];
    }

    addMember(member) {
        /* Adds a member to the gym */
        this.members.push(member);
        //console.log(this.members)
    }

    updateMembership(memberId, membershipStatus) {
        /* Update membership of the given member */
        for (const member of this.members) {
            if (member.memberId === memberId) {
                member.membershipStatus = membershipStatus;
                break;
            }
        }
    }

    getMembershipStatistics() {
        /* Calculates and returns membership statistics for all members */
        const totalMembers = this.members.length;

        const totalPaidMembers=
            this.members.filter(
                (member) => member.membershipStatus === MembershipStatus.ELITE).length;

        // const totalPaidMembers2 =
        // this.members.filter(
        //   (member) => member.membershipStatus === MembershipStatus.PRO).length;

        //const totalPaidMembers = totalPaidMembers1+totalPaidMembers2;


        var conversionRate = ((totalPaidMembers/totalMembers)) * 100;

        return {
            totalMembers,
            totalPaidMembers,
            conversionRate,
        };
    }

}

const testMethods = {
    testMember: () => {
        const testMember = new Member(1, "John Doe", MembershipStatus.BASIC);
        assert.strictEqual(testMember.memberId, 1);
        assert.strictEqual(testMember.name, "John Doe");
        assert.strictEqual(testMember.membershipStatus, MembershipStatus.BASIC);
    },
    testMembership: () => {
        const testMembership = new Membership();
        const testMember = new Member(1, "John Doe", MembershipStatus.BASIC);
        //console.log(testMember)
        testMembership.addMember(testMember);
        assert.strictEqual(testMembership.members.length, 1);
        assert.ok(testMembership.members[0].isEqual(testMember));

        testMembership.updateMembership(1, MembershipStatus.PRO);
        assert.strictEqual(
            testMembership.members[0].membershipStatus,
            MembershipStatus.PRO
        );

        const testMember2 = new Member(2, "Alex C", MembershipStatus.BASIC);
        testMembership.addMember(testMember2);

        const testMember3 = new Member(3, "Marie C", MembershipStatus.ELITE);
        testMembership.addMember(testMember3);

        const testMember4 = new Member(4, "Joe D", MembershipStatus.PRO);
        testMembership.addMember(testMember4);

        const attendanceStats = testMembership.getMembershipStatistics();
        assert.strictEqual(attendanceStats.totalMembers, 4);
        assert.strictEqual(attendanceStats.totalPaidMembers, 3);
        assert.ok(Math.abs(attendanceStats.conversionRate - 75.00) < 0.1);
    },
}


// run all tests
Object.getOwnPropertyNames(testMethods).forEach((func) => {
    try {
        console.log(`Running ${func}`);
        testMethods[func]();
        console.log('OK');
    } catch (e) {
        console.log('FAIL');
        console.log(e);
    }
    console.log('');
});