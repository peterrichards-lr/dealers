package com.liferay.raybia.dealer.search.spi.model.result.contributor;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import com.liferay.raybia.dealer.constants.DealerConstants;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = "indexer.class.name=com.liferay.raybia.dealer.model.Dealer", service = ModelSummaryContributor.class)
public class DealerModelSummaryContributor implements ModelSummaryContributor {

	@Override
	public Summary getSummary(Document document, Locale locale, String snippet) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return createSummary(document, LocalizationUtil.getLocalizedName(Field.NAME, languageId),
				LocalizationUtil.getLocalizedName(DealerConstants.Field.STATE, languageId),
				LocalizationUtil.getLocalizedName(DealerConstants.Field.LOCALITY, languageId));
	}

	private Summary createSummary(Document document, String nameField, String stateName, String localityName) {

		String prefix = Field.SNIPPET + StringPool.UNDERLINE;

		Summary summary = new Summary(document.get(prefix + nameField, nameField),
				document.get(prefix + localityName, localityName) + StringPool.RETURN_NEW_LINE
						+ document.get(prefix + stateName, stateName));

		summary.setMaxContentLength(200);

		return summary;
	}
}
