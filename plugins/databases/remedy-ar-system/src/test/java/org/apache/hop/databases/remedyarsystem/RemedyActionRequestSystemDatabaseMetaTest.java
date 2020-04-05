/*! ******************************************************************************
 *
 * Hop : The Hop Orchestration Platform
 *
 * http://www.project-hop.org
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/
package org.apache.hop.databases.remedyarsystem;

import org.apache.hop.core.database.DatabaseMeta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemedyActionRequestSystemDatabaseMetaTest {
  RemedyActionRequestSystemDatabaseMeta odbcMeta;

  @Before
  public void setupBefore() {
    odbcMeta = new RemedyActionRequestSystemDatabaseMeta();
    odbcMeta.setAccessType( DatabaseMeta.TYPE_ACCESS_ODBC );
  }

  @Test
  public void testSettings() throws Exception {
    assertArrayEquals( new int[] { DatabaseMeta.TYPE_ACCESS_ODBC },
      odbcMeta.getAccessTypeList() );
    assertEquals( 1, odbcMeta.getNotFoundTK( true ) );
    assertEquals( 0, odbcMeta.getNotFoundTK( false ) );
    assertEquals( "jdbc:odbc:WIBBLE", odbcMeta.getURL( "FOO", "BAR", "WIBBLE" ) );
    assertFalse( odbcMeta.isFetchSizeSupported() );
    assertFalse( odbcMeta.supportsBitmapIndex() );
    assertFalse( odbcMeta.isRequiringTransactionsOnQueries() );
    assertFalse( odbcMeta.supportsViews() );
  }

}