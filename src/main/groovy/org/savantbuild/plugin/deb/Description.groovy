/*
 * Copyright (c) 2014, Inversoft Inc., All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.savantbuild.plugin.deb

/**
 *
 * @author Brian Pontarelli
 */
class Description {
  public String extended = ""

  public String synopsis

  Description(String extended, String synopsis) {
    this.extended = extended != null ? extended : ""
    this.synopsis = synopsis
  }

  public String getExtendedFormatted() {
    StringBuilder build = new StringBuilder(extended.length())
    String[] lines = extended.trim().split("\n")

    lines.each { line ->
      line = line.trim()
      build.append(" ${line.length() == 0 ? "." : line}\n")
    }

    build.deleteCharAt(build.length() - 1)
    return build.toString()
  }
}
