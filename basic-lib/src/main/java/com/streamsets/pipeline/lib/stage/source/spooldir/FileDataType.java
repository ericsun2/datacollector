/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.lib.stage.source.spooldir;

import com.streamsets.pipeline.api.Label;

public enum FileDataType implements Label {
  LOG_DATA("Log Data"),
  JSON_DATA("JSON Data"),
  DELIMITED_DATA("Delimited Data"),
  XML_DATA("XML Data"),
  ERROR_RECORDS("Error Records"),

  ;

  private final String label;

  FileDataType(String label) {
    this.label = label;
  }

  @Override
  public String getLabel() {
    return label;
  }

}
