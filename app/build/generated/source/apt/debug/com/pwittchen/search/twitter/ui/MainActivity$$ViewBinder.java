// Generated code from Butter Knife. Do not modify!
package com.pwittchen.search.twitter.ui;

import android.content.res.Resources;
import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.pwittchen.search.twitter.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492974, "field 'recyclerViewTweets'");
    target.recyclerViewTweets = finder.castView(view, 2131492974, "field 'recyclerViewTweets'");
    view = finder.findRequiredView(source, 2131492971, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131492971, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131492972, "field 'searchView'");
    target.searchView = finder.castView(view, 2131492972, "field 'searchView'");
    view = finder.findRequiredView(source, 2131492975, "field 'messageContainerLayout'");
    target.messageContainerLayout = finder.castView(view, 2131492975, "field 'messageContainerLayout'");
    view = finder.findRequiredView(source, 2131492976, "field 'imageViewMessage'");
    target.imageViewMessage = finder.castView(view, 2131492976, "field 'imageViewMessage'");
    view = finder.findRequiredView(source, 2131492977, "field 'textViewMessage'");
    target.textViewMessage = finder.castView(view, 2131492977, "field 'textViewMessage'");
    view = finder.findRequiredView(source, 2131492973, "field 'progressLoadingMoreTweets'");
    target.progressLoadingMoreTweets = finder.castView(view, 2131492973, "field 'progressLoadingMoreTweets'");
    Resources res = finder.getContext(source).getResources();
    target.msgNoInternetConnection = res.getString(2131099674);
    target.msgCannotLoadMoreTweets = res.getString(2131099671);
    target.msgNoTweets = res.getString(2131099675);
    target.msgNoTweetsFormatted = res.getString(2131099676);
    target.msgSearchedFormatted = res.getString(2131099678);
    target.msgApiRateLimitExceeded = res.getString(2131099668);
    target.msgErrorDuringSearch = res.getString(2131099673);
  }

  @Override public void unbind(T target) {
    target.recyclerViewTweets = null;
    target.toolbar = null;
    target.searchView = null;
    target.messageContainerLayout = null;
    target.imageViewMessage = null;
    target.textViewMessage = null;
    target.progressLoadingMoreTweets = null;
  }
}
