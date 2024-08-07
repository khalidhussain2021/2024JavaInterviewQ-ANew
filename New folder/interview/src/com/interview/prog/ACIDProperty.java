package com.interview.prog;

public class ACIDProperty {
	/*
	 * 
	 *1.Atomicity: is treated as a single indivisible unit of work.
	 *Consider a banking application where a user transfers funds from one account to another.
	 *The transaction involves two operations: deducting funds from 
	 *the source account and adding funds to the destination account. 
	 *Atomicity ensures that both operations are completed successfully or neither of them is.
	 *If deducting funds succeeds but adding funds fails (e.g., due to a network error), 
	 *the transaction is rolled back, and the source account is not debited.
	 * 
	 *2.Consistency:
	 * which means if a change in the database is made, it should remain preserved always. 
	 * In the case of transactions, the integrity of the data is very essential so that 
	 * the database remains consistent before and after the transaction.
	 * The data should always be correct.
	 * 
	 * 3.Isolation: the concurrent execution of multiple transactions does not interfere with each other
	 * Isolation prevents dirty reads operation.
	 * 
	 * If two operations are concurrently running on two different accounts, 
	 * then the value of both accounts should not get affected. 
	 * The value should remain persistent.
	 * 
	 * Durability: once a transaction is committed, its effects are permanently stored in the database and survive
	 * even system failures ex. crashes , power outage.
	 * 
	 * After a successful funds transfer transaction in a banking system, 
	 * the updated account balances must be durably stored on disk to ensure that 
	 * they are not lost in the event of a system failure. 
	 * Even if the system crashes immediately after the transaction is committed, 
	 * the changes should still be preserved when the system restarts.
	 * 
	 * 
	 * 
	 */

}
