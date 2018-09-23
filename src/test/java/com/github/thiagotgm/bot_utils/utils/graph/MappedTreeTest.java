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

package com.github.thiagotgm.bot_utils.utils.graph;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for {@link Graphs#mappedTree(java.util.Map) MappedTree}.
 * 
 * @version 1.0
 * @author ThiagoTGM
 * @since 2018-09-22
 */
@DisplayName( "MappedTree tests" )
public class MappedTreeTest extends TreeTest {

    @Override
    protected Tree<String, List<Integer>> getTree() {

        return Graphs.mappedTree( new HashMap<>() );

    }

    @Override
    protected boolean acceptsNullKeys() {

        return true;

    }

    @Override
    protected boolean acceptsNullValues() {

        return true;

    }

}