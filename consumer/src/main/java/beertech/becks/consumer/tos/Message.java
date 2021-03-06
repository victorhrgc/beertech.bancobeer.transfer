package beertech.becks.consumer.tos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Represents the json sent by the rabbit queue
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	/**
	 * The operation type (D || S || T)
	 */
	private String operation;

	/**
	 * The operation value
	 */
	private BigDecimal value;

	/**
	 * Indicates the unique code of the account that is the sender of this
	 * transaction
	 */
	private String originAccountCode;

	/**
	 * Indicates the unique code of the account that is the recipient of this
	 * transaction
	 */
	private String destinationAccountCode;
}