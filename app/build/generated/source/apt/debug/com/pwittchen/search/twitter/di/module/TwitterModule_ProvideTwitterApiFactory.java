package com.pwittchen.search.twitter.di.module;

import com.pwittchen.search.twitter.twitter.TwitterApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwitterModule_ProvideTwitterApiFactory implements Factory<TwitterApi> {
  private final TwitterModule module;

  public TwitterModule_ProvideTwitterApiFactory(TwitterModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TwitterApi get() {
    return Preconditions.checkNotNull(
        module.provideTwitterApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TwitterApi> create(TwitterModule module) {
    return new TwitterModule_ProvideTwitterApiFactory(module);
  }
}
