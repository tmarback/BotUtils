/*
 * This file is part of BotUtils.
 *
 * BotUtils is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BotUtils is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with BotUtils. If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.thiagotgm.bot_utils.storage.translate;

import com.github.thiagotgm.bot_utils.storage.Data;
import com.github.thiagotgm.bot_utils.storage.Translator;

/**
 * Translator for Bytes.
 * 
 * @version 1.0
 * @author ThiagoTGM
 * @since 2018-09-02
 */
public class ByteTranslator implements Translator<Byte> {

	@Override
	public Data toData( Byte obj ) throws TranslationException {
		
		return Data.numberData( obj );
		
	}
	
	/**
	 * Retrieves a byte from a Data instance.
	 * <p>
	 * If the value of the data is too large to be stored in a Byte,
	 * {@link Byte#MAX_VALUE} is returned. Similarly, if it is
	 * smaller than than the minimum possible Byte, {@link Byte#MIN_VALUE}
	 * is returned.
	 */
	@Override
	public Byte fromData( Data data ) throws TranslationException {
		
		if ( !data.isNumber() ) {
			throw new TranslationException( "Given data is not a number." );
		}

		long n = data.getNumberInteger();
		return (byte) Long.max( Byte.MIN_VALUE, Long.min( Byte.MAX_VALUE, n ) );
		
	}

}
