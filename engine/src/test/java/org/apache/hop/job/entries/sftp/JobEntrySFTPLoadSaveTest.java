/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2018 by Hitachi Vantara : http://www.pentaho.com
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

package org.apache.hop.job.entries.sftp;

import java.util.Arrays;
import java.util.List;

import org.junit.ClassRule;
import org.apache.hop.job.entry.loadSave.JobEntryLoadSaveTestSupport;
import org.apache.hop.junit.rules.RestoreHopEngineEnvironment;

public class JobEntrySFTPLoadSaveTest extends JobEntryLoadSaveTestSupport<JobEntrySFTP> {
  @ClassRule public static RestoreHopEngineEnvironment env = new RestoreHopEngineEnvironment();

  @Override
  protected Class<JobEntrySFTP> getJobEntryClass() {
    return JobEntrySFTP.class;
  }

  @Override
  protected List<String> listCommonAttributes() {
    return Arrays.asList( new String[] { "serverName", "serverPort", "userName", "password", "scpDirectory",
      "targetDirectory", "wildcard", "remove", "addToResult", "createTargetFolder", "copyPrevious",
      "useKeyFile", "keyFilename", "keyPassPhrase", "compression", "proxyType", "proxyHost", "proxyPort",
      "proxyUsername", "proxyPassword" } );
  }

}