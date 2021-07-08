package com.liferay.raybia.dealer.search.spi.model.query.contributor;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import com.liferay.raybia.dealer.constants.DealerConstants;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	     immediate = true,
	     property = "indexer.class.name=com.liferay.raybia.dealer.model.Dealer",
	     service = KeywordQueryContributor.class
	 )
public class DealerKeywordQueryContributor implements KeywordQueryContributor {

	@Override
	public void contribute(String keywords, BooleanQuery booleanQuery,
			KeywordQueryContributorHelper keywordQueryContributorHelper) {

		SearchContext searchContext =
             keywordQueryContributorHelper.getSearchContext();

         queryHelper.addSearchLocalizedTerm(
             booleanQuery, searchContext, DealerConstants.Field.STATE, false);
         queryHelper.addSearchLocalizedTerm(
                 booleanQuery, searchContext, DealerConstants.Field.LOCALITY, false);
         queryHelper.addSearchLocalizedTerm(
             booleanQuery, searchContext, Field.NAME, false);	}

    @Reference
    protected QueryHelper queryHelper;
}
