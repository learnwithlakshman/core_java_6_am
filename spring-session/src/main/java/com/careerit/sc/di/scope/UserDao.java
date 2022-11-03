package com.careerit.sc.di.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.StringJoiner;

@Component
public class UserDao {

  @Autowired
  private S3Connection s3Connection;

  @Override
  public String toString() {
    return new StringJoiner(", ", super.toString() + "[", "]")
        .add("s3Connection=" + s3Connection)
        .toString();
  }
}
