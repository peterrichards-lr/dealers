package com.liferay.raybia.dealer.search.spi.model.index.contributor;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = "indexer.class.name=com.liferay.raybia.dealer.model.Dealer", service = ModelIndexerWriterContributor.class)
public class DealerModelIndexerContributor implements ModelIndexerWriterContributor<Dealer> {

	@Override
	public void customize(BatchIndexingActionable batchIndexingActionable,
			ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
		batchIndexingActionable.setPerformActionMethod((Dealer dealer) -> {
			Document document = modelIndexerWriterDocumentHelper.getDocument(dealer);

			batchIndexingActionable.addDocuments(document);
		});
	}

	@Override
	public BatchIndexingActionable getBatchIndexingActionable() {
		return dynamicQueryBatchIndexingActionableFactory
				.getBatchIndexingActionable(dealerLocalService.getIndexableActionableDynamicQuery());
	}

	@Override
	public long getCompanyId(Dealer dealer) {
		return dealer.getCompanyId();
	}

	@Reference
	protected DealerLocalService dealerLocalService;

	@Reference
	protected DynamicQueryBatchIndexingActionableFactory dynamicQueryBatchIndexingActionableFactory;
}
